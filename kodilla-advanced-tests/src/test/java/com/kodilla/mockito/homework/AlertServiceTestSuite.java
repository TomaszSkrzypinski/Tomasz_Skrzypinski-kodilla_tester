package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AlertServiceTestSuite {

    AlertService alertService = new AlertService();

    Alert alert = Mockito.mock(Alert.class);

    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);
    Localizations localization1 = Mockito.mock(Localizations.class);
    Localizations localization2 = Mockito.mock(Localizations.class);
    Localizations localization3 = Mockito.mock(Localizations.class);

    //Osoba niezapisana do subskrypcji nie otrzymuje alertu.
    @Test
    public void notSubscribedClientShouldNotReceiveAlert() {
        alertService.sendAlertForAll(alert);
        Mockito.verify(client1, Mockito.never()).receive(alert);
        Mockito.verify(client2, Mockito.never()).receive(alert);
        Mockito.verify(client3, Mockito.never()).receive(alert);
    }

    //Możliwość usunięcia subskrypcji z danej lokalizacji.
    @Test
    public void unsubscribedForSpecifiedLocalizationClientShouldNotReceiveNotification() {
        alertService.addSubscriber(client1, localization1);
        alertService.addSubscriber(client1, localization2);
        alertService.removeSubscriberForOneLocalization(client1, localization2);//Metoda removeSubscriber... usuwa obie pozycje dla client1
        alertService.addSubscriber(client3, localization1);
        alertService.addSubscriber(client3, localization2);
        alertService.removeSubscriberForOneLocalization(client3, localization2);//Metoda removeSubscriber... usuwa obie pozycje dla client3

        alertService.sendAlertForAll(alert);
        Mockito.verify(client1, Mockito.times(1)).receive(alert);
        Mockito.verify(client3, Mockito.times(1)).receive(alert);
//        alertService.sendAlertForOneLocalization(alert, localization1);
//        Mockito.verify(client1, Mockito.times(1)).receive(alert);
//        Mockito.verify(client3, Mockito.times(1)).receive(alert);
    }

    //Możliwość wysyłki alertu do wybranej lokalizacji.
    @Test
    public void alertShouldBeSentToSpecifiedLocalizationSubscribedClients() {
        alertService.addSubscriber(client1, localization2);//Zmiana kolejności 51 z 52 spowoduje błąd testu
        alertService.addSubscriber(client1, localization1);
        alertService.addSubscriber(client3, localization3);//Zmiana kolejności 531 z 54 spowoduje błąd testu
        alertService.addSubscriber(client3, localization1);

        alertService.sendAlertForOneLocalization(alert, localization1);
        Mockito.verify(client1, Mockito.times(1)).receive(alert);
        Mockito.verify(client2, Mockito.never()).receive(alert);
        Mockito.verify(client3, Mockito.times(1)).receive(alert);
    }

    //Możliwość wysyłki alertu do wybranej lokalizacji.
    @Test
    public void alertShouldBeSentToSpecifiedLocalizationSubscribedClients2() {
        alertService.addSubscriber(client1, localization2);//Zmiana kolejności 65 z 66 spowoduje błąd testu
        alertService.addSubscriber(client1, localization1);
        alertService.addSubscriber(client3, localization2);//Zmiana kolejności 67 z 68 spowoduje błąd testu
        alertService.addSubscriber(client3, localization1);

        alertService.sendAlertForOneLocalization2(alert, localization1);
        Mockito.verify(client1, Mockito.times(1)).receive(alert);
        Mockito.verify(client2, Mockito.never()).receive(alert);
        Mockito.verify(client3, Mockito.times(1)).receive(alert);
    }

    //Możliwość wysyłki powiadomienia do wszystkich.
    @Test
    public void alertShouldBeSentToAllSubscribedClients() {
        alertService.addSubscriber(client1, localization1);
        alertService.addSubscriber(client2, localization2);
        alertService.addSubscriber(client1, localization3);
        alertService.addSubscriber(client3, localization1);

        alertService.sendAlertForAll(alert);
        Mockito.verify(client1, Mockito.times(1)).receive(alert);
        Mockito.verify(client2, Mockito.times(1)).receive(alert);
        Mockito.verify(client3, Mockito.times(1)).receive(alert);
    }
}