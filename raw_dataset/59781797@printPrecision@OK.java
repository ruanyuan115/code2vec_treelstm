/**
 * ************************************Precision Printing*********************************************
 */
static void printPrecision(double d) {
    DecimalFormat ft = new DecimalFormat("0.00000000000000000");
    out.println(ft.format(d));
}