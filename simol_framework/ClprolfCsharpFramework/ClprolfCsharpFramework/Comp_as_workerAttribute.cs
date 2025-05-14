using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Org.Clprolf.Framework.Csharp
{
    [AttributeUsage(AttributeTargets.Class | AttributeTargets.Interface)]
    public class Comp_as_workerAttribute: Attribute
    {
        private Role role;

        public Comp_as_workerAttribute(Role theRole = Role.UNDEFINED)
        {
            this.role = theRole;
        }
    }
}
