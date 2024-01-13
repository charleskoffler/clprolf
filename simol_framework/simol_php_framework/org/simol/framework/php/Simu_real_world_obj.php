<?php
namespace org\simol\framework\php;

use \Attribute;

enum Role /* since PHP 8.1 */
{
    case DESIGN_ROLE;
    case GUI_ROLE;
    case HUMAN_EXPERT;
    case MACHINE_TOOL;
    case UNDEFINED;
};

/**
 * Simol framework for PHP 8. v1.0.
 * 
 * About Simol PHP framework:
 * 
 * Nature and Constracts not present due to PHP attributes limitations, and
 * With_compat is not on local variables.
 * TurnMonitor, For_every_thread, One_at_a_time, because thread support is not supplied in Simol PHP Framework.
 */

#[Attribute(Attribute::TARGET_CLASS)]
class Simu_real_world_obj
{
    
    private $role;
    
    public function __construct(Role $theRole = Role::UNDEFINED)
    {
        $this->role = $theRole;
    }
}