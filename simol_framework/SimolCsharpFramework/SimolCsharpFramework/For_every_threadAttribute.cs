using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestAttrsAvecConsole
{
    [AttributeUsage(AttributeTargets.Field)]
    class For_every_threadAttribute: Attribute
    {
    }
}
