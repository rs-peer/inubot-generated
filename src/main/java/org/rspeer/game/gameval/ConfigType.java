package org.rspeer.game.gameval;

public enum ConfigType {

  ANIMATION,
  EFFECT,
  INTERFACE,
  COMPONENT,
  INVENTORY,
  ITEM,
  NPC,
  OBJECT,
  VARBIT,
  VARP;

  public static String toString(ConfigType configType, int id) {
    switch (configType) {
      case ANIMATION:
        return AnimationId.toString(id);
      case EFFECT:
        return EffectId.toString(id);
      case INTERFACE:
      case COMPONENT:
        return InterfaceId.toString(id);
      case INVENTORY:
        return InventoryId.toString(id);
      case ITEM:
        return ItemId.toString(id);
      case NPC:
        return NpcId.toString(id);
      case OBJECT:
        return ObjectId.toString(id);
      case VARP:
        return VarpId.toString(id);
      case VARBIT:
        return VarbitId.toString(id);
    }

    return "UNK_" + id;
  }
}
