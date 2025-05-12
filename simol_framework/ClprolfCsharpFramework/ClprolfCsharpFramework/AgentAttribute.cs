using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace Org.Clprolf.Framework.Csharp
{
   
    [AttributeUsage(AttributeTargets.Class)]
    public class AgentAttribute: Attribute
    {
       
        private Role role;

        public AgentAttribute(Role theRole = Role.UNDEFINED)
        {
            this.role = theRole;
        }
    }
}
