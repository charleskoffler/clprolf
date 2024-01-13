<?php
namespace org\simol\framework\php\examples;

use org\simol\framework\php\Simu_real_world_obj;


/* Usage example. 
 */

#[Simu_real_world_obj]
class Animal implements CanEat {
    public $age;
    public $nom;
    
    public function eat($qte){
        echo "I'm eating $qte kg!";
    }
}