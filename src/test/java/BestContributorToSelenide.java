import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.Selenide.open;
public class BestContributorToSelenide {
    @Test
    void andreiSolntsevShoulBeTheFirstContributor(){
        // открыть страницу репозитория селенида
        open("https://github.com/selenide/selenide");
        // подвести мышку к первому автору из блока contributors
        $("div.Layout-sidebar").$(byText("Contributors"))
                //.closest(".BorderGrid-cell").$$("ul li").first().hover();
                .closest("h2").sibling(0).$$("li").first().hover();
        // проверка: во всплывающем окне есть текст Andrei Solntsev
        $(".Popover-message").shouldHave(text("Andrei Solntsev"));

    }
}
