package me.RUDD33.com;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Instructions extends JavaPlugin {
	
	final FileConfiguration config = this.getConfig();

    public void onEnable() {
		new ExampleListener(this);
		
		//Join Message
		config.addDefault("onJoin", "&3&lWelcome to the server");
		//First Delayed Message
		config.addDefault("FirstMessage", "");
		config.addDefault("FirstMessage.Message", "&3&l[Instructions] &3Having trouble? Type &b/help&3.");
		config.addDefault("FirstMessage.Delay", 5);
		//Second Delayed Message
		config.addDefault("SecondMessage", "");
		config.addDefault("SecondMessage.Message", "&3&l[Instructions] &3You can vote with &b/vote &3to earn cool items.");
		config.addDefault("SecondMessage.Delay", 10);
		//Third Delayed Message
		config.addDefault("ThirdMessage", "");
		config.addDefault("ThirdMessage.Message", "&3&lRight foot lets stomp.");
		config.addDefault("ThirdMessage.Delay", 15);
		//Fourth Delayed Message
		config.addDefault("FourthMessage", "");
		config.addDefault("FourthMessage.Message", "&3&lLeft foot lets stomp.");
		config.addDefault("FourthMessage.Delay", 17);
		//Fifth Delayed Message
		config.addDefault("FifthMessage", "");
		config.addDefault("FifthMessage.Message", "&b&lFREEZE!");
		config.addDefault("FifthMessage.Delay", 19);
		//Sixth Delayed Message
		config.addDefault("SixthMessage", "");
		config.addDefault("SixthMessage.Message", "&3&lNow, everybody clap your hands!");
		config.addDefault("SixthMessage.Delay", 22);
		//Seventh Delayed Message
		config.addDefault("SeventhMessage", "");
		config.addDefault("SeventhMessage.Message", "NONE");
		config.addDefault("SeventhMessage.Delay", 0);
		//Eighth Delayed Message
		config.addDefault("EighthMessage", "");
		config.addDefault("EighthMessage.Message", "NONE");
		config.addDefault("EighthMessage.Delay", 0);
		//Ninth Delayed Message
		config.addDefault("NinthMessage", "");
		config.addDefault("NinthMessage.Message", "NONE");
		config.addDefault("NinthMessage.Delay", 0);
		//Tenth Delayed Message
		config.addDefault("TenthMessage", "");
		config.addDefault("TenthMessage.Message", "NONE");
		config.addDefault("TenthMessage.Delay", 0);
		 
		getConfig().options().header("Message: Message sent to user | Delay: How long in seconds, from join, to wait for the next message | Add 'NONE' to messages that aren't used (ex: Message: NONE). Works with onJoin, as well.");
		
		config.options().copyDefaults(true);
		saveConfig();
    }
    
    class ExampleListener implements Listener {
    	 
        private final Instructions plugin;
     
        public ExampleListener(Instructions plugin) {
            this.plugin = plugin;
            plugin.getServer().getPluginManager().registerEvents(this, plugin);
        }
    
        @EventHandler
        public void onFirstJoin(PlayerJoinEvent e) {
        	final Player p = e.getPlayer();
        	
        	if (p.hasPermission("instructions.player")){
        		if (!p.hasPlayedBefore()){
        	
        	if (!(getConfig().getString("onJoin").contains("NONE"))){
        	p.sendMessage(getConfig().getString("onJoin").replaceAll("(&([a-l0-9]))", "\u00A7$2"));
        	}
        	
            // Delay First Message
            new BukkitRunnable() {
                @Override
                public void run() {
                	if (!(getConfig().getString("FirstMessage.Message").contains("NONE"))){
                    p.sendMessage(getConfig().getString("FirstMessage.Message").replaceAll("(&([a-l0-9]))", "\u00A7$2"));
                	}
                }
            }.runTaskLater(this.plugin, (getConfig().getInt("FirstMessage.Delay") * 20));
            
            //Delay Second Message
            new BukkitRunnable() {
                @Override
                public void run() {
                	if (!(getConfig().getString("SecondMessage.Message").contains("NONE"))){
                    p.sendMessage(getConfig().getString("SecondMessage.Message").replaceAll("(&([a-l0-9]))", "\u00A7$2"));
                	}
                }
            }.runTaskLater(this.plugin, (getConfig().getInt("SecondMessage.Delay") * 20));
            
            // Delay Third Message
            new BukkitRunnable() {
                @Override
                public void run() {
                	if (!(getConfig().getString("ThirdMessage.Message").contains("NONE"))){
                    p.sendMessage(getConfig().getString("ThirdMessage.Message").replaceAll("(&([a-l0-9]))", "\u00A7$2"));
                	}
                }
            }.runTaskLater(this.plugin, (getConfig().getInt("ThirdMessage.Delay") * 20));
            
            // Delay Fourth Message
            new BukkitRunnable() {
                @Override
                public void run() {
                	if (!(getConfig().getString("FourthMessage.Message").contains("NONE"))){
                    p.sendMessage(getConfig().getString("FourthMessage.Message").replaceAll("(&([a-l0-9]))", "\u00A7$2"));
                	}
                }
            }.runTaskLater(this.plugin, (getConfig().getInt("FourthMessage.Delay") * 20));
            
            // Delay Fifth Message
            new BukkitRunnable() {
                @Override
                public void run() {
                	if (!(getConfig().getString("FifthMessage.Message").contains("NONE"))){
                    p.sendMessage(getConfig().getString("FifthMessage.Message").replaceAll("(&([a-l0-9]))", "\u00A7$2"));
                	}
                }
            }.runTaskLater(this.plugin, (getConfig().getInt("FifthMessage.Delay") * 20));
            
            // Delay Sixth Message
            new BukkitRunnable() {
                @Override
                public void run() {
                	if (!(getConfig().getString("SixthMessage.Message").contains("NONE"))){
                    p.sendMessage(getConfig().getString("SixthMessage.Message").replaceAll("(&([a-l0-9]))", "\u00A7$2"));
                	}
                }
            }.runTaskLater(this.plugin, (getConfig().getInt("SixthMessage.Delay") * 20));
            
            // Delay Seventh Message
            new BukkitRunnable() {
                @Override
                public void run() {
                	if (!(getConfig().getString("SeventhMessage.Message").contains("NONE"))){
                    p.sendMessage(getConfig().getString("SeventhMessage.Message").replaceAll("(&([a-l0-9]))", "\u00A7$2"));
                	}
                }
            }.runTaskLater(this.plugin, (getConfig().getInt("SeventhMessage.Delay") * 20));
            
            // Delay Eighth Message
            new BukkitRunnable() {
                @Override
                public void run() {
                	if (!(getConfig().getString("EighthMessage.Message").contains("NONE"))){
                    p.sendMessage(getConfig().getString("EighthMessage.Message").replaceAll("(&([a-l0-9]))", "\u00A7$2"));
                	}
                }
            }.runTaskLater(this.plugin, (getConfig().getInt("EighthMessage.Delay") * 20));
            
            // Delay Ninth Message
            new BukkitRunnable() {
                @Override
                public void run() {
                	if (!(getConfig().getString("NinthMessage.Message").contains("NONE"))){
                    p.sendMessage(getConfig().getString("NinthMessage.Message").replaceAll("(&([a-l0-9]))", "\u00A7$2"));
                	}
                }
            }.runTaskLater(this.plugin, (getConfig().getInt("NinthMessage.Delay") * 20));
            
            // Delay Tenth Message
            new BukkitRunnable() {
                @Override
                public void run() {
                	if (!(getConfig().getString("TenthMessage.Message").contains("NONE"))){
                    p.sendMessage(getConfig().getString("TenthMessage.Message").replaceAll("(&([a-l0-9]))", "\u00A7$2"));
                	}
                }
            }.runTaskLater(this.plugin, (getConfig().getInt("TenthMessage.Delay") * 20));
        }
    }
    }
    }
    
      //Allows players to reload the config.
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		Player p = (Player) sender;
			
		if (p.hasPermission("instructions.reload")){
		if (alias.equalsIgnoreCase("instructions")) {
			if (args.length != 1) {
			p.sendMessage(ChatColor.RED + "[Error] Incorrect number of arguments! Try" + ChatColor.GREEN + " /instructions reload" + ChatColor.RED + ".");
			 
			} else {
			if (args[0].equalsIgnoreCase("reload")) {
				this.reloadConfig();
				p.sendMessage(ChatColor.GREEN + "Instructions config reloaded!");
			} else {
			p.sendMessage(ChatColor.RED + "[Error] Incorrect argument! Try" + ChatColor.GREEN + " /instructions reload" + ChatColor.RED + ".");
			}
			}
			}
	    }
		return false;
	}
}
