<?php
namespace org\simol\framework\php\examples;

use org\simol\framework\php\Compat_interf_capacity;

#[Compat_interf_capacity]
interface CanEat {
    function eat($qte);
}