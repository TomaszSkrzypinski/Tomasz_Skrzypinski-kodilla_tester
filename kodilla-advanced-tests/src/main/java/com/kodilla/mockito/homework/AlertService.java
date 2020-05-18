package com.kodilla.mockito.homework;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class AlertService {


    private Map<Client ,Localizations> clientsAndLocalisations = new HashMap <>();

    public void addSubscriber(Client client, Localizations localization) {
        this.clientsAndLocalisations.put(client, localization);
    }

        public void removeSubscriberForOneLocalization(Client client, Localizations localization) {
        this.clientsAndLocalisations.remove(client, localization);
    }

    //Możliwość wysyłki powiadomienia do wybranej lokalizacji.
    public void sendAlertForOneLocalization(Alert alert, Localizations localization) {
        List <Client> clients = clientsAndLocalisations.entrySet()
                .stream().filter(u -> u.getValue().equals(localization))
                .map(u -> u.getKey())
                .collect(Collectors.toList());
        clients.forEach(client -> client.receive(alert));
    }

    //Możliwość wysyłki powiadomienia do wybranej lokalizacji2.
    public void sendAlertForOneLocalization2(Alert alert, Localizations localization) {
        Set <Client> clients = new HashSet <>();
        for (Map.Entry <Client, Localizations> note : clientsAndLocalisations.entrySet()) {
            if (note.getValue().equals(localization)) {
                clients.add(note.getKey());
            }
        }
        clients.forEach(client -> client.receive(alert));
    }

    //Możliwość wysyłki powiadomienia do wszystkich.
    public void sendAlertForAll(Alert alert) {
        Set <Client> clients = clientsAndLocalisations.entrySet()
                .stream().map(u -> u.getKey())
                .collect(Collectors.toSet());
        clients.forEach(client -> client.receive(alert));
    }

}
