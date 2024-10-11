package clprolf.wrappers.javax.swing;

import javax.swing.JButton;

import org.simol.simolframework.java.Forced_inh;
import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Role;
import org.simol.simolframework.java.Simu_real_obj;

@Forced_inh
@Simu_real_obj(Role.GUI_ROLE) //Could have been @Abstraction!
public class ClpJButton extends @Nature JButton {

}
