package org.jakartaee.sample.websocket.event;

import jakarta.websocket.Session;

public record OnSessionOpenEvent(Session session, String playerName) implements GameServerEvent {
}