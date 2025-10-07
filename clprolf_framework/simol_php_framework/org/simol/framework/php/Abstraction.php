<?php
namespace org\simol\framework\php;

use \Attribute;

enum Role /* since PHP 8.1 */
{
    case DESIGN_ROLE;
    case HUMAN_EXPERT;
    case EXPERT_COMPONENT;
    case GUI_ROLE;
    case MACHINE_TOOL;
    case UNDEFINED;
};


#[Attribute(Attribute::TARGET_CLASS)]
class Abstraction
{
    
    private $role;
    
    public function __construct(Role $theRole = Role::UNDEFINED)
    {
        $this->role = $theRole;
    }
}