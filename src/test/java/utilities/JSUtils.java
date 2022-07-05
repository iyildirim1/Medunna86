package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSUtils {
    public static void scrollIntoViewByJS(WebElement webElement){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",webElement);

    }

    //Scroll all the way down of a page by using js executor
    public static void scrollAllDownByJS(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver();
        javascriptExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    //Scroll all the way up of a page by using js executor
    public static void scrollAllDownUpJS(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver();
        javascriptExecutor.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }

    //Click on a specific element by using js executor
    public static void clickByJS(WebElement webElement){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].click()",webElement);
    }

    //Set the value of an input by using js executor webElement date field, text 05/29/2022
    //This method changes the value attribute of an element.
    // it changes the input text.
    public static void setValueByJS(WebElement webElement, String text){

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].setAttribute('value','"+text+"')",webElement);

    }
    //Get the value of an input by using js executor

    public static String getValueByJS(String idOfAnElement){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver();
        String resultValue = javascriptExecutor.executeScript("return document.getElementById('"+idOfAnElement+"').value").toString();

        return resultValue;

        //How you can get the value of an input
        //Whe can use JavaScrip Executor
        //How?
        //I can get the element by js executor, and get the value of the element.
        //Foe example, I can get the element by id, and use value attribute to get the value of ia an input
        //I have to do this, cause getText in this case does not return the text in an input.
    }

    //Changes the background of an element by using js executor
    public static void changeBackgroundColorByJS(WebElement webElement, String color){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].style.backgroundColor='"+color+"'",webElement);

    }

    //Changes the border style of an element by using js executor
    public static void addBorderByJS(WebElement webElement, String borderStyle){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].style.border = '"+borderStyle+"'",webElement);

    }

}
