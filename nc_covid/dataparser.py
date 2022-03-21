import pandas as pd
import numpy as np
df = pd.read_csv("data/us-states data.csv")
nc_df = df[df["state"] == "North Carolina"]
#print(nc_df)
nc_df['date'] = pd.to_datetime(nc_df['date']) - pd.to_timedelta(7, unit='d')
nc_df = nc_df.groupby(['state', pd.Grouper(key='date', freq='W-MON')]).sum().reset_index().sort_values('date')
# cases = nc_df["cases"].to_csv("data/cases.csv", index = False)
# deaths = nc_df["deaths"].to_csv("data/deaths.csv", index = False)
print(len(nc_df[nc_df['fips']==222]))