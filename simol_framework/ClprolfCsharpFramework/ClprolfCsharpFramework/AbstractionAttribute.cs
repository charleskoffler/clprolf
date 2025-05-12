using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace Org.Clprolf.Framework.Csharp
{
   
    [AttributeUsage(AttributeTargets.Class)]
    public class AbstractionAttribute: Attribute
    {
       
        private Role role;

        public AbstractionAttribute(Role theRole = Role.UNDEFINED)
        {
            this.role = theRole;
        }
    }
}
