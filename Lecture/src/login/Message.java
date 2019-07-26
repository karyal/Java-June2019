/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

public class Message {
    String mseeage;
    
    public Message() {
        this.mseeage = "";
    }

    public Message(String mseeage) {
        this.mseeage = mseeage;
    }
    
    public Message(Message m) {
        this.mseeage = m.mseeage;
    }

    public String getMseeage() {
        return mseeage;
    }

    public void setMseeage(String mseeage) {
        this.mseeage = mseeage;
    }

    @Override
    public String toString() {
        return "Message{" + "mseeage=" + mseeage + '}';
    }
    
}
