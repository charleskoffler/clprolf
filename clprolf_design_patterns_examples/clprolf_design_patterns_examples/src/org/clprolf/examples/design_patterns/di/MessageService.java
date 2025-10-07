package org.clprolf.examples.design_patterns.di;

import org.clprolf.framework.java.Compat_interf_version;

//Interface needed for a MessageService version object. Just for asking different versions of a MessageService, especially different
//kind of sending(email, SMS), but implementations from other authors could be accepted too.
//
//public compat_interf_version MessageService
@Compat_interf_version
public interface MessageService {
 void sendMessage(String message);
}
