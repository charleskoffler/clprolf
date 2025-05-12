using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace Org.Clprolf.Framework.Csharp
{
   
    [AttributeUsage(AttributeTargets.Class)]
    public class Simu_agentAttribute: Attribute
    {
       
        private Role role;

        public Simu_agentAttribute(Role theRole = Role.UNDEFINED)
        {
            this.role = theRole;
        }
    }
}
