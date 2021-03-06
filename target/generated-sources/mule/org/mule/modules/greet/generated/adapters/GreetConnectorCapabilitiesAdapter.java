
package org.mule.modules.greet.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.greet.GreetConnector;


/**
 * A <code>GreetConnectorCapabilitiesAdapter</code> is a wrapper around {@link GreetConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-04-26T10:11:41-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class GreetConnectorCapabilitiesAdapter
    extends GreetConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
