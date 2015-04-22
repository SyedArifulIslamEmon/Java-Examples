package ProjectCode;

import java.io.File;

import pp.Mail;


public class Mail {
    private String subject;
    private String message;
    private String sender;
    private String[] toRecipient;
    private String[] ccRecipient;
    private String[] bccRecipient;
    private File[] attachments;
 
    /**
     * Default constructor.
     */
    public Mail() {
    super();
    }
 
  
    public Mail(String subject, String message, String sender,
        String[] toRecipient, String[] ccRecipient, String[] bccRecipient,
        File[] attachments) {
    super();
    this.subject = subject;
    this.message = message;
    this.sender = sender;
    this.toRecipient = toRecipient;
    this.ccRecipient = ccRecipient;
    this.bccRecipient = bccRecipient;
    this.attachments = attachments;
    }
 
    public String getSubject() {
    return subject;
    }
 
    public void setSubject(String subject) {
    this.subject = subject;
    }
 
    public String getMessage() {
    return message;
    }
 
    public void setMessage(String message) {
    this.message = message;
    }
 
    public String getSender() {
    return sender;
    }
 
    public void setSender(String sender) {
    this.sender = sender;
    }
 
    
    public String[] getToRecipient() {
    return toRecipient;
    }
  
    public void setToRecipient(String[] toRecipient) {
    this.toRecipient = toRecipient;
    }
 
  
    public String[] getCcRecipient() {
    return ccRecipient;
    }
  
    public void setCcRecipient(String[] ccRecipient) {
    this.ccRecipient = ccRecipient;
    }
 
   
    public String[] getBccRecipient() {
    return bccRecipient;
    }
 
    
    public void setBccRecipient(String[] bccRecipient) {
    this.bccRecipient = bccRecipient;
    }
 
     
    public File[] getAttachments() {
    return attachments;
    }
 
      
    public void setAttachments(File[] attachments) {
    this.attachments = attachments;
    }
    
    
 
}
////- See more at: http://www.codemiles.com/java-examples/java-email-class-t10934.html#sthash.NxrYJbWu.dpuf
