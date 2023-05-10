package Interfaces;

@SuppressWarnings("unused")
public abstract class IValidator {
    /**
     * Returns true if {@code arguments} are null or blank, else false.
     * @param User - Username
     * @return Boolean
     */
    abstract boolean isNullOnUser(String User);
    /**
     * Returns true if {@code arguments} are null or blank, else false.
     * @param Pass - Password
     * @return Boolean
     */
    abstract boolean isNullOnPass(String Pass);

    /**
     * Returns true if {@code arguments} are null or blank, else false.
     * @param User - Username
     * @param Pass - Password
     * @return Boolean
     */
    public static boolean isNullOnBoth(String User, String Pass){
        return (User.equals("") || User.equals("null")) && (Pass.equals("") || Pass.equals("null"));
    }
}
