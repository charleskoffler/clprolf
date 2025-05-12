using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Org.Clprolf.Framework.Csharp
{
    [AttributeUsage(AttributeTargets.Interface)]
    public class Version_inhAttribute : Attribute
    {
        private Role role;

        public Version_inhAttribute(Role theRole = Role.UNDEFINED)
        {
            this.role = theRole;
        }
    }
}
