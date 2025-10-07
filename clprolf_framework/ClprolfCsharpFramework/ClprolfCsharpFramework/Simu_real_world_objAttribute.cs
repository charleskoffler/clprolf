using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/***
 * Simol C# Framework, v2.8 (20250514)
 * 
 * Agent declensions allowed upon interfaces, for optional features for interface inheritance.
 * 
 * Limitations of C# framework for simol:
 * 
 * No 'nature' or 'contracts' attributes, nor possibility to have 'With_compat' on a local variable. All this is due
 * to C# attributes limitations. And no Forced_inh and forced_int_inh on types of the list of inherited class and interfaces of a class/interface definition.
 */
namespace Org.Clprolf.Framework.Csharp
{
   
    [AttributeUsage(AttributeTargets.Class | AttributeTargets.Interface)]
    public class Simu_real_world_objAttribute: Attribute
    {
       
        private Role role;

        public Simu_real_world_objAttribute(Role theRole = Role.UNDEFINED)
        {
            this.role = theRole;
        }
    }
}
