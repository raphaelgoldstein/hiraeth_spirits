package mc.thehealingangel.hiraeth_spirits.client.model;

import mc.thehealingangel.hiraeth_spirits.Configurations;
import mc.thehealingangel.hiraeth_spirits.HiraethSpirits;
import mc.thehealingangel.hiraeth_spirits.client.model.antler.ModelAntlers1;
import mc.thehealingangel.hiraeth_spirits.client.model.antler.ModelAntlers2;
import mc.thehealingangel.hiraeth_spirits.client.model.antler.ModelAntlers3;
import mc.thehealingangel.hiraeth_spirits.client.model.antler.ModelAntlers4;
import mc.thehealingangel.hiraeth_spirits.client.model.ear.ModelEars1;
import mc.thehealingangel.hiraeth_spirits.client.model.ear.ModelEars2;
import mc.thehealingangel.hiraeth_spirits.client.model.horn.ModelHorns1;
import mc.thehealingangel.hiraeth_spirits.client.model.horn.ModelHorns2;
import mc.thehealingangel.hiraeth_spirits.client.model.horn.ModelHorns3;
import mc.thehealingangel.hiraeth_spirits.networking.packet.MessageUpdateModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class ModelInit
{
    public static final Map<UUID, int[]> playerModelMap = new HashMap<>();

    public static final ModelBase[] ANTLERS = {new ModelAntlers1(), new ModelAntlers2(), new ModelAntlers3(), new ModelAntlers4()};
    public static final ModelBase[] HORNS = {new ModelHorns1(), new ModelHorns2(), new ModelHorns3()};
    public static final ModelBase[] EARS = {new ModelEars1(), new ModelEars2()};
    public static final int[] SKIN_TONE_COLORS = {0xFFFFDBAC, 0xFFF1C27D, 0xFFE0AC69, 0xFFC68642, 0xFF8D5524};

    public static int[] getModelIndexesArrayByUUID(UUID uuid)
    {
        int[] models = new int[]{0, 0, 0, 0};
        UUID clientUUID = Minecraft.getMinecraft().player.getUniqueID();
        if (clientUUID.equals(uuid))
        {
            models[0] = Configurations.Antlers;
            models[1] = Configurations.Horns;
            models[2] = Configurations.Ears;
            models[3] = Configurations.SkinTone;
        }
        else if (playerModelMap.containsKey(uuid))
        {
            models = playerModelMap.get(uuid).clone();
            for (int i = 0; i < 4; ++i)
                if (models[i] == -1)
                {
                    HiraethSpirits.NETWORK_CHANNEL.sendToServer(new MessageUpdateModel(uuid, i, 0));
                    models[i] = 0;
                }
        }
        else
        {
            playerModelMap.put(uuid, new int[] {-1, -1, -1, -1});
            for (int i = 0; i < 4; ++i)
                HiraethSpirits.NETWORK_CHANNEL.sendToServer(new MessageUpdateModel(uuid, i, 0));
        }
        return models;
    }
}