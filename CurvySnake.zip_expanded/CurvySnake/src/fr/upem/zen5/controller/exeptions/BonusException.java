package fr.upem.zen5.controller.exeptions;

/**Exception representing a Bonus. THis exception is throw when :
 * When the BonusListInGame is empty */

public class BonusException extends Exception {
    public BonusException(String s) {
        super(s);
    }
}
