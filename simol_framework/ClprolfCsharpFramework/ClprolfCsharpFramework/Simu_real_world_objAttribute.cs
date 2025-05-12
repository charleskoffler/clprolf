using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/***
 * Simol C# Framework, v2.7 (20250512)
 * 
 * New roles and sub-role for multi-agent system perspective.
    New optional annotations for interface inheritance( @Version_int and @Capacity_inh)
    New enum for compat_interf_capacity and capacity_inh (Advice).
    Removed beginners package.
    Addition of @Indef_obj and @Compat_interf
    Addition of a role (for @Static) in worker_agent declensions.
    Independent enum for Role.
 * 
 * Limitations of C# framework for simol:
 * 
 * No 'nature' or 'contracts' attributes, nor possibility to have 'With_compat' on a local variable. All this is due
 * to C# attributes limitations. And no Forced_inh and forced_int_inh on types of the list of inherited class and interfaces of a class/interface definition.
 */
namespace Org.Clprolf.Framework.Csharp
{
   
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
