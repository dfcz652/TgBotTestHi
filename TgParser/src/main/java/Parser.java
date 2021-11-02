import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import javax.print.Doc;
import java.io.IOException;
import java.net.URL;

public class Parser extends TelegramLongPollingBot {

    private static final String TOKEN = "2099424124:AAE4zzcLeWK74ad6Zkh-d3yv4ytYc6qIRvM";
    private static final String USERNAME = "WhoFinderPeoples_bot";

    public void onUpdateReceived(Update update) {
        if(update.getMessage()!=null && update.getMessage().hasText()){
            long chat_id= update.getMessage().getChatId();

            try {
                execute(new SendMessage(chat_id,"Пидор " + update.getMessage().getText()));
            }  catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    public String getBotUsername() {
        return USERNAME;
    }

    public String getBotToken() {
        return TOKEN;
    }

//    public static void main(String[] args) throws IOException{
//        System.out.println(getPage());
//    }
}
