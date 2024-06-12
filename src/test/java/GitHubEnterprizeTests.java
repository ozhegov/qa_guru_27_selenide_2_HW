import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GitHubEnterprizeTests {

@BeforeAll
    static void conf(){
    Configuration.browserSize = "1920 x 1080";
    Configuration.pageLoadStrategy = "eager";
}

@Test
    void checkGitHubPage(){
    open("https://github.com/");
    $$(".HeaderMenu-item").findBy(text("Solutions")).hover();
    $(byTagAndText("a", "Enterprise")).click();
    $(byTagAndText("h1","The AI-powered")).shouldBe(visible);
}
}
