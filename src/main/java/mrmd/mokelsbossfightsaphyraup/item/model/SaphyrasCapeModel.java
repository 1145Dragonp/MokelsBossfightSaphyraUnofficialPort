package mrmd.mokelsbossfightsaphyraup.item.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.item.SaphyrasCapeItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SaphyrasCapeModel extends GeoModel<SaphyrasCapeItem> {
   public ResourceLocation getAnimationResource(SaphyrasCapeItem object) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/capesaphyraanimated.animation.json");
   }

   public ResourceLocation getModelResource(SaphyrasCapeItem object) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/capesaphyraanimated.geo.json");
   }

   public ResourceLocation getTextureResource(SaphyrasCapeItem object) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/item/capesaphyratexture.png");
   }
}
