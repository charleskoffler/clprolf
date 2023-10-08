package org.simol.examples.design_patterns.di;

//Interface needed for a MessageService version object. Just for asking different versions of a MessageService, especially different
//kind of sending(email, SMS), but implementations from other authors could be accepted too.
//
//public compat_interf_version MessageService
public interface MessageService {
 void sendMessage(String message);
}
