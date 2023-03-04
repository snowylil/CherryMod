package net.snowylil.cherrymod.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.snowylil.cherrymod.CherryMod;

public class CherrySounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CherryMod.CHERRYMOD);

//    public static final RegistryObject<SoundEvent> CHERRY_BREAK = registerSoundEventV("cherry_break");
//    public static final RegistryObject<SoundEvent> CHERRY_STEP = registerSoundEventV("cherry_break");
//    public static final RegistryObject<SoundEvent> CHERRY_PLACE = registerSoundEventV("cherry_break");
//    public static final RegistryObject<SoundEvent> CHERRY_HIT = registerSoundEventV("cherry_break");
//    public static final RegistryObject<SoundEvent> CHERRY_FALL = registerSoundEventV("cherry_break");

    //public static final RegistryObject<SoundEvent> KEH = registerSoundEventF("keh", 4f);

    private static RegistryObject<SoundEvent> registerSoundEventV(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent
                (new ResourceLocation(CherryMod.CHERRYMOD, name)));
    }
    private static RegistryObject<SoundEvent> registerSoundEventF(String name, float num) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createFixedRangeEvent
                (new ResourceLocation(CherryMod.CHERRYMOD, name), num));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);}
}
