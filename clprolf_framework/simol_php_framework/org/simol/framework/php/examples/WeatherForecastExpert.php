<?php
namespace org\simol\framework\php\examples;

use org\simol\framework\php\Simu_real_world_obj;
use org\simol\framework\php\Role;

/* Usage example. 
 */

#[Simu_real_world_obj(Role::HUMAN_EXPERT)]
class WeatherForecastExpert {
    public $expertName;
   
    public function makeForecast($cityCode){
        echo "Excellent weather this week!";
    }
}