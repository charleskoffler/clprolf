using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/***
 * Simol C# Framework, v2.5, 20240920.
 * 
 * New static sub-roles for simu_real_world_obj("Role.STATIC", "Role.HUMAN_EXPERT_STATIC", and "Role.EXPERT_COMPONENT_STATIC").
 * 
 * 
 * Limitations of C# framework for simol:
 * 
 * No 'nature' or 'contracts' attributes, nor possibility to have 'With_compat' on a local variable. All this is due
 * to C# attributes limitations. And no Forced_inh and forced_int_inh on types of the list of inherited class and interfaces of a class/interface definition.
 */
namespace Org.Clprolf.Framework.Csharp
{
    public enum Role
    {
        DESIGN_ROLE,
        HUMAN_EXPERT,
        HUMAN_EXPERT_STATIC,
        EXPERT_COMPONENT,
        EXPERT_COMPONENT_STATIC,
        STATIC,
        GUI_ROLE,
        MACHINE_TOOL,
        UNDEFINED
    };

    [AttributeUsage(AttributeTargets.Class)]
    public class Simu_real_world_objAttribute: Attribute
    {
       
        private Role role;

        public Simu_real_world_objAttribute(Role theRole = Role.UNDEFINED)
        {
            this.role = theRole;
        }
    }
}
