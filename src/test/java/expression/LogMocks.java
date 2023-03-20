package expression;

import static java.lang.Double.*;
import static java.lang.Math.PI;
import static org.mockito.Mockito.*;


class LogMocks {
    static NaturalLogarithm getLnMock() {
        final NaturalLogarithm m = mock(NaturalLogarithm.class);

        when(m.ln(1 * PI / 6)).thenReturn(-0.647_029_583_378_654_9);
        when(m.ln(1 * PI / 4)).thenReturn(-0.241_564_475_270_490_5);
        when(m.ln(-PI / 4)).thenReturn(NaN);
        when(m.ln(-PI / 2)).thenReturn(NaN);
        when(m.ln(-3 * PI / 4)).thenReturn(NaN);
        when(m.ln(-PI)).thenReturn(NaN);
        when(m.ln(-5 * PI / 4)).thenReturn(NaN);
        when(m.ln(-7 * PI / 4)).thenReturn(NaN);
        when(m.ln(-4 * PI / 3)).thenReturn(NaN);
        when(m.ln(-2 * PI)).thenReturn(NaN);
        when(m.ln(PI / 8)).thenReturn(-0.934_711_655_830_435_754_11);
        when(m.ln(3 * PI / 16)).thenReturn(-0.529_246_547_722_271_4);
        when(m.ln(PI / 3)).thenReturn(0.046_117_597_181_290_482_7);
        when(m.ln(PI / 2)).thenReturn(0.451_582_705_289_454_864_7);
        when(m.ln(PI)).thenReturn(1.144_729_885_849_400_174_1);
        when(m.ln(2 * PI)).thenReturn(1.837_877_066_409_345_483_56);
        when(m.ln(3 * PI)).thenReturn(2.243_342_174_517_509_9);
        when(m.ln(2)).thenReturn(0.693_147_180_559_945_309_4);
        when(m.ln(3)).thenReturn(1.098_612_288_668_109_691_4);
        when(m.ln(5)).thenReturn(1.609_437_912_434_100_374_6);

        when(m.ln(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.ln(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.ln(NaN)).thenReturn(NaN);

        return m;
    }

    static Logarithms getLogMock() {
        final Logarithms m = mock(Logarithms.class);

        when(m.log2(PI / 6)).thenReturn(-0.933_466_371_248_837_6);
        when(m.log2(PI / 4)).thenReturn(-0.348_503_870_527_681_3);
        when(m.log2(PI / 3)).thenReturn(0.028_654_474_226_683_595);
        when(m.log2(PI)).thenReturn(1.651_496_129_472_319);
        when(m.log2(PI / 2)).thenReturn(0.651_496_129_472_318_8);
        when(m.log2(-PI / 2)).thenReturn(NaN);
        when(m.log2(-PI / 3)).thenReturn(0.028_654_474_226_683_595);
        when(m.log2(-PI / 4)).thenReturn(NaN);
        when(m.log2(-3 * PI / 4)).thenReturn(NaN);
        when(m.log2(-PI)).thenReturn(NaN);
        when(m.log2(-5 * PI / 4)).thenReturn(NaN);
        when(m.log2(-7 * PI / 4)).thenReturn(NaN);


        when(m.log2(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.log2(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.log2(NaN)).thenReturn(NaN);

        when(m.log3(PI / 6)).thenReturn(-0.588_951_707_579_271_6);
        when(m.log3(PI / 4)).thenReturn(-0.219_881_461_150_729_04);
        when(m.log3(PI / 3)).thenReturn(0.028_654_474_226_683_595);
        when(m.log3(PI)).thenReturn(1.041_978_045_992_185_7);
        when(m.log3(PI / 2)).thenReturn(0.411_048_292_420_728_4);
        when(m.log3(-PI / 2)).thenReturn(NaN);
        when(m.log3(-PI / 3)).thenReturn(0.028_654_474_226_683_595);
        when(m.log3(-PI / 4)).thenReturn(NaN);
        when(m.log3(-3 * PI / 4)).thenReturn(NaN);
        when(m.log3(-PI)).thenReturn(NaN);
        when(m.log3(-5 * PI / 4)).thenReturn(NaN);
        when(m.log3(-7 * PI / 4)).thenReturn(NaN);

        when(m.log3(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.log3(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.log3(NaN)).thenReturn(NaN);

        when(m.log5(PI / 6)).thenReturn(-0.402_022_083_846_709_45);
        when(m.log5(PI / 4)).thenReturn(-0.150_092_447_434_117_18);
        when(m.log5(PI / 3)).thenReturn(0.028_654_474_226_683_595);
        when(m.log5(PI)).thenReturn(0.711_260_668_712_669);
        when(m.log5(PI / 2)).thenReturn(0.280_584_110_639_275_9);
        when(m.log5(-PI / 2)).thenReturn(NaN);
        when(m.log5(-PI / 3)).thenReturn(0.028_654_474_226_683_595);
        when(m.log5(-PI / 4)).thenReturn(NaN);
        when(m.log5(-3 * PI / 4)).thenReturn(NaN);
        when(m.log5(-PI)).thenReturn(NaN);
        when(m.log5(-5 * PI / 4)).thenReturn(NaN);
        when(m.log5(-7 * PI / 4)).thenReturn(NaN);

        when(m.log5(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.log5(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.log5(NaN)).thenReturn(NaN);

        when(m.log10(PI / 6)).thenReturn(-0.281_001_377_689_509_8);
        when(m.log10(PI / 4)).thenReturn(-0.150_092_447_434_117_18);
        when(m.log10(PI / 3)).thenReturn(0.028_654_474_226_683_595);
        when(m.log10(PI)).thenReturn(0.497_149_872_694_133_8);
        when(m.log10(PI / 8)).thenReturn(-0.405_940_114_297_809_74);
        when(m.log10(3 * PI / 16)).thenReturn(-0.229_848_855_242_128);
        when(m.log10(PI / 2)).thenReturn(0.196_119_877_030_152_659_1);


        when(m.log10(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.log10(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.log10(NaN)).thenReturn(NaN);

        return m;
    }
}
