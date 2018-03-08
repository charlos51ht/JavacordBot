package supreme.leader.charlie;
import de.btobastian.javacord.*;
import de.btobastian.javacord.entities.impl.*;
import de.btobastian.javacord.entities.*;
import de.btobastian.javacord.listener.*;
import de.btobastian.javacord.entities.message.*;
import de.btobastian.javacord.listener.message.MessageCreateListener;
import de.btobastian.sdcf4j.*;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;
import de.btobastian.sdcf4j.CommandHandler;
import java.io.*;
import de.btobastian.sdcf4j.handler.*;
import com.google.common.util.concurrent.*;
import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args)
	{
		DiscordAPI api = Javacord.getApi("NDA2NDcxNjU1NTA2ODM3NTA2.DVzpGw.Ob-rI34bXyCTb3n8_MfbfjDLSyM",true);
		api.connect(new FutureCallback<DiscordAPI>() {
			public void onSuccess(final DiscordAPI api) {
				api.registerListener(new MessageCreateListener() {
					public void onMessageCreate(DiscordAPI api, Message message) {
							if(message.getContent().equals("!hc help"))
							{
								message.reply("!hc hey: Charlie responds back with a friendly hello");
								message.reply("!hc tellajoke: Charlie Tells a Joke");
							}
							else if(message.getContent().equals("!hc hey"))
							{
								String greeting = "";
								Random r = new Random();
								int rand = r.nextInt(5)+1;
								switch(rand)
								{
									case 1:
									greeting+="Hello, ";
									break;
									case 2:
									greeting+="Greetings, ";
									break;
									case 3:
									greeting+="Hola mi amigo ";
									break;
									case 4:
									greeting+="Sa'vaq, ";
									break;
									case 5:
									greeting+="Whazup, ";
									break;
								}
								message.reply(greeting + message.getAuthor().getName());
							}
							else if(message.getContent().equals("!hc tellajoke"))
							{
							     	String s = "What goes up and down but does not move? Stairs\r\n" + 
							     			"Where should a 500 pound alien go? On a diet\r\n" + 
							     			"What did one toilet say to the other? You look a bit flushed.\r\n" + 
							     			"Why did the picture go to jail? Because it was framed.\r\n" + 
							     			"What did one wall say to the other wall? I'll meet you at the corner. \r\n" + 
							     			"What did the paper say to the pencil? Write on! \r\n" + 
							     			"What do you call a boy named Lee that no one talks to? Lonely\r\n" + 
							     			"What gets wetter the more it dries? A towel. \r\n" + 
							     			"Why do bicycles fall over? Because they are two-tired! \r\n" + 
							     			"Why do dragons sleep during the day? So they can fight knights! \r\n" + 
							     			"What did Cinderella say when her photos did not show up? Someday my prints will come! \r\n" + 
							     			"Why was the broom late? It over swept!\r\n" + 
							     			"What part of the car is the laziest? The wheels, because they are always tired!\r\n" + 
							     			"What did the stamp say to the envelope? Stick with me and we will go places! \r\n" + 
							     			"What is blue and goes ding dong? An Avon lady at the North Pole!\r\n" + 
							     			"We're you long in the hospital? No, I was the same size I am now!\r\n" + 
							     			"Why couldn't the pirate play cards? Because he was sitting on the deck!\r\n" + 
							     			"What did the laundryman say to the impatient customer? Keep your shirt on!\r\n" + 
							     			"What's the difference between a TV and a newspaper? Ever tried swatting a fly with a TV?\r\n" + 
							     			"What did one elevator say to the other elevator? I think I'm coming down with something!\r\n" + 
							     			"Why was the belt arrested? Because it held up some pants!\r\n" + 
							     			"Why was everyone so tired on April 1st? They had just finished a March of 31 days.\r\n" + 
							     			"Which hand is it better to write with? Neither, it's best to write with a pen!\r\n" + 
							     			"Why can't your nose be 12 inches long? Because then it would be a foot!\r\n" + 
							     			"What makes the calendar seem so popular? Because it has a lot of dates!\r\n" + 
							     			"Why did Mickey Mouse take a trip into space? He wanted to find Pluto!\r\n" + 
							     			"What is green and has yellow wheels? Grass…..I lied about the wheels!\r\n" + 
							     			"What is it that even the most careful person overlooks? Her nose!\r\n" +  
							     			"Why do you go to bed every night? Because the bed won't come to you!\r\n" + 
							     			"Why did Billy go out with a prune? Because he couldn't find a date!\r\n" + 
							     			"Why do eskimos do their laundry in Tide? Because it's too cold out-tide!\r\n" + 
							     			"What has four wheels and flies? A garbage truck!\r\n" + 
							     			"What kind of car does Mickey Mouse's wife drive? A minnie van!\r\n" + 
							     			"Why don't traffic lights ever go swimming? Because they take too long to change!\r\n" + 
							     			"Why did the man run around his bed? To catch up on his sleep!\r\n" + 
							     			"Why did the robber take a bath before he stole from the bank? He wanted to make a clean get away!";
							     	ArrayList<String> jokes = new ArrayList<String>();
							     	for(int i = 0; i < s.length();i++)
							     	{
							     		if(s.charAt(i)== 'W')
							     		{
							     			String subs = s.substring(i);
							     			for(int k = 0; k < subs.length();k++)
							     			{
							     				if(subs.charAt(k) == '!')
							     				{
							     					jokes.add(s.substring(k, k+i));
							     					break;
							     				}
							     			}
							     		}
							     	}
							     	Random r = new Random();
							     	String rand = jokes.get(r.nextInt(jokes.size()-1)+1);
							     	message.reply(jokes.get(1));
							    
							}
					  }
					});
			  }
			
			  public void onFailure(Throwable t) {
			    // login failed
			    t.printStackTrace();
			  }
			});
	}

}
