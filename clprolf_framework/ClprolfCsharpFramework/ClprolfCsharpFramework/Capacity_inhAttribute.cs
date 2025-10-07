using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Org.Clprolf.Framework.Csharp
{
    [AttributeUsage(AttributeTargets.Interface)]
    public class Capacity_inhAttribute : Attribute
    {
        private Advice advice;

        public Capacity_inhAttribute(Advice theAdvice = Advice.FOR_AGENT_LIKE)
        {
            this.advice = theAdvice;
        }
    }
}
