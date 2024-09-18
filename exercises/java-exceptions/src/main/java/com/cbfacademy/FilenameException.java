package com.cbfacademy;

public class FilenameException {
    public String message;

    public FilenameException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return String.join("-")
    }
}
