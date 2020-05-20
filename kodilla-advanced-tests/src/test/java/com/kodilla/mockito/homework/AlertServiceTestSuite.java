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

    //Osoba niezapisana do subskrypcji nie otrzymuje alertu. - DZIALA
    @Test
    public void notSubscribedClientShouldNotReceiveAlert() {
        alertService.sendAlertForAll(alert);
        Mockito.verify(client1, Mockito.never()).receive(alert);
        Mockito.verify(client2, Mockito.never()).receive(alert);
        Mockito.verify(client3, Mockito.never()).receive(alert);
    }

    //Ad.2 - Możliwość usunięcia subskrypcji z danej lokalizacji. - DZIALA
    @Test
    public void unsubscribedForSpecifiedLocalizationClientShouldNotReceiveNotification() {
        alertService.addSubscriberAndLocalization(client1, localization2);
        alertService.removeSubscriberForOneLocalization(client1, localization2);
        alertService.addSubscriberAndLocalization(client3, localization2);
        alertService.removeSubscriberForOneLocalization(client3, localization2);
        alertService.addSubscriberAndLocalization(client2, localization1);
        alertService.addSubscriberAndLocalization(client2, localization2);
        alertService.addSubscriberAndLocalization(client2, localization3);
        alertService.removeSubscriberForOneLocalization(client2, localization1);


        alertService.sendAlertForAll(alert);
        Mockito.verify(client1, Mockito.times(0)).receive(alert);
        Mockito.verify(client3, Mockito.times(0)).receive(alert);
        Mockito.verify(client2, Mockito.times(1)).receive(alert);
    }

    //Ad.3 - Całkowite usunięcie klienta. DZIALA
    @Test
    public void shouldBeRemoveClient() {
        alertService.addSubscriberAndLocalization(client1, localization2);
        alertService.addSubscriberAndLocalization(client1, localization1);
        alertService.addSubscriberAndLocalization(client1, localization3);
        alertService.addSubscriberAndLocalization(client2, localization3);
        alertService.removeSubscriberPermanently(client1);

        alertService.sendAlertForAll(alert);
        Mockito.verify(client1, Mockito.times(0)).receive(alert);
        Mockito.verify(client2, Mockito.times(1)).receive(alert);
    }

    //Ad.4 - Możliwość wysyłki alertu do wybranej lokalizacji. - DZIALA
    @Test
    public void alertShouldBeSentToSpecifiedLocalizationSubscribedClients() {
        alertService.addSubscriberAndLocalization(client1, localization3);
        alertService.addSubscriberAndLocalization(client1, localization1);
        alertService.addSubscriberAndLocalization(client3, localization3);
        alertService.addSubscriberAndLocalization(client3, localization1);
        alertService.addSubscriberAndLocalization(client3, localization2);

        alertService.sendAlertForOneLocalization(alert, localization3);
        alertService.sendAlertForOneLocalization(alert, localization1);
        Mockito.verify(client1, Mockito.times(2)).receive(alert);
        Mockito.verify(client2, Mockito.never()).receive(alert);
        Mockito.verify(client3, Mockito.times(2)).receive(alert);
    }

    //Ad.4 - Możliwość wysyłki alertu do wybranej lokalizacji2.
    @Test
    public void alertShouldBeSentToSpecifiedLocalizationSubscribedClients2() {
        alertService.addSubscriberAndLocalization(client1, localization2);
        alertService.addSubscriberAndLocalization(client1, localization1);
        alertService.addSubscriberAndLocalization(client3, localization2);
        alertService.addSubscriberAndLocalization(client3, localization1);
        alertService.addSubscriberAndLocalization(client3, localization3);

        alertService.sendAlertForOneLocalization2(alert, localization1);
        alertService.sendAlertForOneLocalization2(alert, localization2);
        Mockito.verify(client1, Mockito.times(2)).receive(alert);
        Mockito.verify(client2, Mockito.never()).receive(alert);
        Mockito.verify(client3, Mockito.times(2)).receive(alert);
    }

    //Ad.5 - Możliwość wysyłki powiadomienia do wszystkich.
    @Test
    public void alertShouldBeSentToAllSubscribedClients() {
        alertService.addSubscriberAndLocalization(client1, localization1);
        alertService.addSubscriberAndLocalization(client2, localization2);
        alertService.addSubscriberAndLocalization(client3, localization3);
        alertService.addSubscriberAndLocalization(client3, localization1);

        alertService.sendAlertForAll(alert);
        Mockito.verify(client1, Mockito.times(1)).receive(alert);
        Mockito.verify(client2, Mockito.times(1)).receive(alert);
        Mockito.verify(client3, Mockito.times(1)).receive(alert);
    }

    //Ad.6 - Skasowanie lokalizacji. - DZIALA
    @Test
    public void shouldBeRemoveLocalization() {
        alertService.addSubscriberAndLocalization(client1, localization1);
        alertService.addSubscriberAndLocalization(client1, localization2);
        alertService.addSubscriberAndLocalization(client2, localization1);
        alertService.addSubscriberAndLocalization(client2, localization2);
        alertService.removeLocalization(localization1);

        alertService.sendAlertForOneLocalization(alert, localization1);
        alertService.sendAlertForOneLocalization(alert, localization2);
        Mockito.verify(client1, Mockito.times(1)).receive(alert);
        Mockito.verify(client2, Mockito.times(1)).receive(alert);
    }
}