package com.amydegregorio.devnullsmtp.dto;

public class Email {
   private String toAddress = "";
   private String fromAddress = "";
   private String subject = "";
   private String message = "";
   
   /**
    * Gets toAddress.
    * @return the toAddress
    */
   public String getToAddress() {
      return toAddress;
   }
   
   /**
    * Sets toAddress.
    * @param toAddress the toAddress to set
    */
   public void setToAddress(String toAddress) {
      this.toAddress = toAddress;
   }
   
   /**
    * Gets fromAddress.
    * @return the fromAddress
    */
   public String getFromAddress() {
      return fromAddress;
   }
   
   /**
    * Sets fromAddress.
    * @param fromAddress the fromAddress to set
    */
   public void setFromAddress(String fromAddress) {
      this.fromAddress = fromAddress;
   }
   
   /**
    * Gets subject.
    * @return the subject
    */
   public String getSubject() {
      return subject;
   }
   
   /**
    * Sets subject.
    * @param subject the subject to set
    */
   public void setSubject(String subject) {
      this.subject = subject;
   }
   
   /**
    * Gets message.
    * @return the message
    */
   public String getMessage() {
      return message;
   }
   
   /**
    * Sets message.
    * @param message the message to set
    */
   public void setMessage(String message) {
      this.message = message;
   }

   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
      return "Email [toAddress=" + toAddress + ", fromAddress=" + fromAddress + ", subject=" + subject + ", message="
               + message + "]";
   }
   
   
}
