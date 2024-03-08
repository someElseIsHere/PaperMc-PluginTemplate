package com.example.plugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.net.http.WebSocket.Listener;

public class ExamplePlugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getLogger().info("ExamplePlugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ExamplePlugin has been disabled!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("Welcome to the server, " + player.getName() + "!");
    }
}
