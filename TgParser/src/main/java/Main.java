import org.telegram.telegrambots.ApiContext;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {



        ApiContextInitializer.init();

//        DefaultBotOptions botOptions = ApiContext.getInstance(DefaultBot



        Parser parser= new Parser();

        TelegramBotsApi botsApi = new TelegramBotsApi();

        try{
            botsApi.registerBot(parser);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
