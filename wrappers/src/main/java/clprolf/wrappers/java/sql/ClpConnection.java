package clprolf.wrappers.java.sql;

import java.sql.Connection;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Forced_int_inh;
import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.Version_inh;


@Forced_int_inh // We can not inherit from Java interfaces naturally.
@Abstraction
public @Version_inh interface ClpConnection extends @Nature Connection {

}
