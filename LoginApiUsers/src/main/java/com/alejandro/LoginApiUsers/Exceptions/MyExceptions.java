package com.alejandro.LoginApiUsers.Exceptions;

public class MyExceptions {

    public static class DataAlreadyExistsException extends Exception{

        /**
         * Exception is thrown when data already exists in database.
         * @param string
         */
        public DataAlreadyExistsException(String string) {
            super(string);
        }
    }

    public static class EmptyFieldsException extends Exception{

        /**
         * Exception is thrown when fields are empty.
         * @param string
         */
        public EmptyFieldsException(String string) {
            super(string);
        }
    }

    public static class NoMatchCoincidenceException extends Exception{

        /**
         * Exception is thrown when data does not match with registers in
         * database.
         * @param string
         */
        public NoMatchCoincidenceException(String string) {
            super(string);
        }

    }


    public static class ExceededSizeException extends Exception{
        /**
         * Exception is thrown when a specific field exceeds the allowed value size.
         * @param string
         */
        public ExceededSizeException(String string) {
            super(string);
        }
    }
}