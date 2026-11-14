package mrmd.mokelsbossfightsaphyraup.block.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.block.display.BossDoor1DisplayItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BossDoor1DisplayModel extends GeoModel<BossDoor1DisplayItem> {
   public ResourceLocation getAnimationResource(BossDoor1DisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/bossgate.animation.json");
   }

   public ResourceLocation getModelResource(BossDoor1DisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/bossgate.geo.json");
   }

   public ResourceLocation getTextureResource(BossDoor1DisplayItem entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/block/bossgatetexture.png");
   }
}
