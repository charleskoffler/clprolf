using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace Org.Clprolf.Framework.Csharp
{

    [AttributeUsage(AttributeTargets.Class | AttributeTargets.Interface)]
    public class Agent_abstractionAttribute: Attribute
    {
       
        private Role role;

        public Agent_abstractionAttribute(Role theRole = Role.UNDEFINED)
        {
            this.role = theRole;
        }
    }
}
