package myStack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("BEGIN");
        MyStackElem<String> jan = new MyStackElem("January");
        MyStackElem<String> feb = new MyStackElem("February");
        MyStackElem<String> mar = new MyStackElem("March");

        MyStack myStack = new MyStackImpl();
        myStack.push(jan);
        myStack.push(jan);

        logger.info("END");
    }


}
