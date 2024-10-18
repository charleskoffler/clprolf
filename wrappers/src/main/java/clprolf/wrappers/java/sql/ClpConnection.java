package clprolf.wrappers.java.sql;

import java.sql.Connection;

import org.simol.simolframework.java.Abstraction;
import org.simol.simolframework.java.Compat_interf_version;
import org.simol.simolframework.java.Forced_int_inh;

/**
 * In clprolf, it's an interface to obtain different implementation versions of it!
 * The obtained implementing class, is only there to give a version of this.
 * @author Charles Koffler
 *
 */
@Forced_int_inh // We can not inherit from Java interfaces naturally. And we could not inherit from another compat_interf_version!
@Abstraction // We can add a class role, for public APIs, or other projects with much collaboration.
public @Compat_interf_version interface ClpConnection extends Connection {

}
