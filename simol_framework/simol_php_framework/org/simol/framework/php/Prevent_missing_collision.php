<?php
namespace org\simol\framework\php;

use \Attribute;

#[Attribute(Attribute::TARGET_METHOD)]
class Prevent_missing_collision
{
    public function __construct()
    {
        
    }
}
