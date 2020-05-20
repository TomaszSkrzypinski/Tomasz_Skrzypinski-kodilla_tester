package com.kodilla.mockito.homework;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class AlertService {

    private Map <Client, Set <Localizations>> clientsAndLocalisations = new HashMap <>();
    private Set <Localizations> localizations = new HashSet <>();

    //Dodaje klienta i lokalizację.
    public void addSubscriberAndLocalization(Client client, Localizations localization) {
        if (clientsAndLocalisations.size() < 1) {
            clientsAndLocalisations.put(client, localizations);
            clientsAndLocalisations.get(client).add(localization);
        } else {for (Map.Entry <Client, Set<Localizations>> note : clientsAndLocalisations.entrySet()) { //Kompilator zgłasza błąd w tym wierszu w sytuacji kiedy dodaję 3 klientów.KLIENTÓW.
                if (note.getKey().equals(client)) {
                    note.getValue().add(localization);
                } else {
                    clientsAndLocalisations.put(client, localizations);
                    clientsAndLocalisations.get(client).add(localization);
                }
            }
        }
    }

    //Usuwa lokalizację dla danego klienta.
    public void removeSubscriberForOneLocalization(Client client, Localizations localization) {
        for (Map.Entry <Client, Set <Localizations>> note : clientsAndLocalisations.entrySet()) {
            note.getValue().remove(localization);
            if (note.getValue().size() == 0) {
                clientsAndLocalisations.remove(client);
            }
        }
    }

    //Usunięcie klienta ze wszystkich lokalizacji.
    public void removeSubscriberPermanently(Client client) {
        clientsAndLocalisations.remove(client);
    }

    //Możliwość wysyłki powiadomienia do wybranej lokalizacji.
    public void sendAlertForOneLocalization(Alert alert, Localizations localization) {
        List <Client> clients = clientsAndLocalisations.entrySet()
                .stream()
                .filter(u -> u.getValue().contains(localization))
                .map(u -> u.getKey())
                .collect(Collectors.toList());
        clients.forEach(client -> client.receive(alert));
    }

    //Możliwość wysyłki powiadomienia do wybranej lokalizacji2.
    public void sendAlertForOneLocalization2(Alert alert, Localizations localization) {
        Set <Client> clients = new HashSet <>();
        for (Map.Entry <Client, Set <Localizations>> note : clientsAndLocalisations.entrySet()) {
            if (note.getValue().contains(localization)) {
                clients.add(note.getKey());
            } else {
                clients.forEach(client -> client.receive(alert));
            }
        }
    }

    //Możliwość wysyłki powiadomienia do wszystkich.
    public void sendAlertForAll(Alert alert) {
        Set <Client> clients = clientsAndLocalisations.entrySet()
                .stream()
                .map(u -> u.getKey())

                .collect(Collectors.toSet());
        clients.forEach(client -> client.receive(alert));
    }

    //Możliwość skasowania lokalizacji.
    public void removeLocalization(Localizations localization) {
        for (Map.Entry <Client, Set <Localizations>> note : clientsAndLocalisations.entrySet()) {
            note.getValue().remove(localization);
        }
    }
}