 public static int clusterCompression(int[] a)
        {
            if (a.Length % 2 == 0)
            {
                return 0;
            }
            int centerIndex = a.Length / 2;
            bool status = true;
            for (int i = 0; i < a.Length; i++)
            {
                if (i != centerIndex)
                {
                    if (a[i] <= a[centerIndex])
                    {
                        status = false;
                        break;
                    }
                }

            }
            if (status)
            {
                return 1;
            }
            else
            {
                return 0;
            }

        }
