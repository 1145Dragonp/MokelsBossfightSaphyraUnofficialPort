package mrmd.mokelsbossfightsaphyraup.init;

import mrmd.mokelsbossfightsaphyraup.client.model.Modelgrassvisage;
import mrmd.mokelsbossfightsaphyraup.client.model.Modelmirrorbladeprojectile;
import mrmd.mokelsbossfightsaphyraup.client.model.Modelsaphyrashat;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.neoforge.client.event.EntityRenderersEvent.RegisterLayerDefinitions;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;

@EventBusSubscriber(
   bus = Bus.MOD,
   value = {Dist.CLIENT}
)
public class MokelsBossfightSaphyraModModels {
   @SubscribeEvent
   public static void registerLayerDefinitions(RegisterLayerDefinitions event) {
      event.registerLayerDefinition(Modelsaphyrashat.LAYER_LOCATION, Modelsaphyrashat::createBodyLayer);
      event.registerLayerDefinition(Modelmirrorbladeprojectile.LAYER_LOCATION, Modelmirrorbladeprojectile::createBodyLayer);
      event.registerLayerDefinition(Modelgrassvisage.LAYER_LOCATION, Modelgrassvisage::createBodyLayer);
   }
}
