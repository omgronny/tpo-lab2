package expression;

import static java.lang.Double.*;
import static java.lang.Math.PI;
import static org.mockito.Mockito.*;


public class LogMocks {
    public static NaturalLogarithm getLnMock() {
        NaturalLogarithm m = mock(NaturalLogarithm.class);

        when(m.ln(1 * PI / 6)).thenReturn(-0.6470295833786549);
        when(m.ln(1 * PI / 4)).thenReturn(-0.2415644752704905);
        when(m.ln(-PI / 4)).thenReturn(NaN);
        when(m.ln(-PI / 2)).thenReturn(NaN);
        when(m.ln(-3 * PI / 4)).thenReturn(NaN);
        when(m.ln(-PI)).thenReturn(NaN);
        when(m.ln(-5 * PI / 4)).thenReturn(NaN);
        when(m.ln(-7 * PI / 4)).thenReturn(NaN);
        when(m.ln(-4 * PI / 3)).thenReturn(NaN);
        when(m.ln(-2 * PI)).thenReturn(NaN);
        when(m.ln(PI / 8)).thenReturn(-0.93471165583043575411);
        when(m.ln(3 * PI / 16)).thenReturn(-0.5292465477222714);
        when(m.ln(PI / 3)).thenReturn(0.0461175971812904827);
        when(m.ln(PI / 2)).thenReturn(0.4515827052894548647);
        when(m.ln(PI)).thenReturn(1.1447298858494001741);
        when(m.ln(2 * PI)).thenReturn(1.83787706640934548356);
        when(m.ln(3 * PI)).thenReturn(2.2433421745175099);
        when(m.ln(2)).thenReturn(0.6931471805599453094);
        when(m.ln(3)).thenReturn(1.0986122886681096914);
        when(m.ln(5)).thenReturn(1.6094379124341003746);

        when(m.ln(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.ln(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.ln(NaN)).thenReturn(NaN);

        return m;
    }

    public static Logarithms getLogMock() {
        Logarithms m = mock(Logarithms.class);

        when(m.log2(PI / 6)).thenReturn(-0.9334663712488376);
        when(m.log2(PI / 4)).thenReturn(-0.3485038705276813);
        when(m.log2(PI / 3)).thenReturn(0.028654474226683595);
        when(m.log2(PI)).thenReturn(1.651496129472319);
        when(m.log2(PI / 2)).thenReturn(0.6514961294723188);
        when(m.log2(-PI / 2)).thenReturn(NaN);
        when(m.log2(-PI / 3)).thenReturn(0.028654474226683595);
        when(m.log2(-PI / 4)).thenReturn(NaN);
        when(m.log2(-3 * PI / 4)).thenReturn(NaN);
        when(m.log2(-PI)).thenReturn(NaN);
        when(m.log2(-5 * PI / 4)).thenReturn(NaN);
        when(m.log2(-7 * PI / 4)).thenReturn(NaN);


        when(m.log2(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.log2(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.log2(NaN)).thenReturn(NaN);

        when(m.log3(PI / 6)).thenReturn(-0.5889517075792716);
        when(m.log3(PI / 4)).thenReturn(-0.21988146115072904);
        when(m.log3(PI / 3)).thenReturn(0.028654474226683595);
        when(m.log3(PI)).thenReturn(1.0419780459921857);
        when(m.log3(PI / 2)).thenReturn(0.4110482924207284);
        when(m.log3(-PI / 2)).thenReturn(NaN);
        when(m.log3(-PI / 3)).thenReturn(0.028654474226683595);
        when(m.log3(-PI / 4)).thenReturn(NaN);
        when(m.log3(-3 * PI / 4)).thenReturn(NaN);
        when(m.log3(-PI)).thenReturn(NaN);
        when(m.log3(-5 * PI / 4)).thenReturn(NaN);
        when(m.log3(-7 * PI / 4)).thenReturn(NaN);

        when(m.log3(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.log3(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.log3(NaN)).thenReturn(NaN);

        when(m.log5(PI / 6)).thenReturn(-0.40202208384670945);
        when(m.log5(PI / 4)).thenReturn(-0.15009244743411718);
        when(m.log5(PI / 3)).thenReturn(0.028654474226683595);
        when(m.log5(PI)).thenReturn(0.711260668712669);
        when(m.log5(PI / 2)).thenReturn(0.2805841106392759);
        when(m.log5(-PI / 2)).thenReturn(NaN);
        when(m.log5(-PI / 3)).thenReturn(0.028654474226683595);
        when(m.log5(-PI / 4)).thenReturn(NaN);
        when(m.log5(-3 * PI / 4)).thenReturn(NaN);
        when(m.log5(-PI)).thenReturn(NaN);
        when(m.log5(-5 * PI / 4)).thenReturn(NaN);
        when(m.log5(-7 * PI / 4)).thenReturn(NaN);

        when(m.log5(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.log5(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.log5(NaN)).thenReturn(NaN);

        when(m.log10(PI / 6)).thenReturn(-0.2810013776895098);
        when(m.log10(PI / 4)).thenReturn(-0.15009244743411718);
        when(m.log10(PI / 3)).thenReturn(0.028654474226683595);
        when(m.log10(PI)).thenReturn(0.4971498726941338);
        when(m.log10(PI / 8)).thenReturn(-0.40594011429780974);
        when(m.log10(3 * PI / 16)).thenReturn(-0.229848855242128);
        when(m.log10(PI / 2)).thenReturn(0.1961198770301526591);


        when(m.log10(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.log10(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.log10(NaN)).thenReturn(NaN);

        return m;
    }
}
