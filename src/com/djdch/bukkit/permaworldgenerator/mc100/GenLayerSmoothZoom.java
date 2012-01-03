package com.djdch.bukkit.permaworldgenerator.mc100;

/* Working version of GenLayerSmoothZoom class. */
public class GenLayerSmoothZoom extends GenLayer {
    public GenLayerSmoothZoom(long paramLong, GenLayer paramGenLayer) {
        super(paramLong);
        this.a = paramGenLayer;
    }

    @Override
    public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        int i = paramInt1 >> 1;
        int j = paramInt2 >> 1;
        int k = (paramInt3 >> 1) + 3;
        int m = (paramInt4 >> 1) + 3;

        int[] arrayOfInt1 = this.a.a(i, j, k, m);
        int[] arrayOfInt2 = IntCache.a(k * 2 * (m * 2));

        int n = k << 1;

        for (int i1 = 0; i1 < m - 1; i1++) {
            int i2 = i1 << 1;
            int i3 = i2 * n;
            int i4 = arrayOfInt1[0 + (i1 + 0) * k];
            int i5 = arrayOfInt1[0 + (i1 + 1) * k];

            for (int i6 = 0; i6 < k - 1; i6++) {
                a(i6 + i << 1, i1 + j << 1);

                int i7 = arrayOfInt1[i6 + 1 + (i1 + 0) * k];
                int i8 = arrayOfInt1[i6 + 1 + (i1 + 1) * k];

                arrayOfInt2[i3] = i4;
                arrayOfInt2[i3++ + n] = i4 + ((i5 - i4) * a(256)) / 256;
                arrayOfInt2[i3] = i4 + ((i7 - i4) * a(256)) / 256;

                int i9 = i4 + ((i7 - i4) * a(256)) / 256;
                int i10 = i5 + ((i8 - i5) * a(256)) / 256;

                arrayOfInt2[i3++ + n] = i9 + ((i10 - i9) * a(256)) / 256;

                i4 = i7;
                i5 = i8;
            }
        }

        int[] arrayOfInt3 = IntCache.a(paramInt3 * paramInt4);
        for (int i2 = 0; i2 < paramInt4; i2++) {
            System.arraycopy(arrayOfInt2, (i2 + (paramInt2 & 1)) * (k << 1) + (paramInt1 & 1), arrayOfInt3, i2 * paramInt3, paramInt3);
        }

        return arrayOfInt3;
    }

    public static GenLayer a(long paramLong, GenLayer paramGenLayer, int paramInt) {
        Object localObject = paramGenLayer;
        for (int i = 0; i < paramInt; i++) {
            localObject = new GenLayerSmoothZoom(paramLong + (long) i, (GenLayer) localObject);
        }

        return (GenLayer) localObject;
    }
}
